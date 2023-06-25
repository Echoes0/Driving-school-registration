package com.ll.dsr.utils;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.ll.dsr.entity.Student;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public class FileOutIn {

    /**
     * 文件导出
     * @param list 要导出的数据
     * @param response 浏览器请求
     * @param headers 标题别名
     */
    public static<T> void FileOut(List<T> list, HttpServletResponse response, Map<String ,String > headers) throws Exception {
        // 通过工具类创建writer 写出到磁盘路径
//        ExcelWriter writer = ExcelUtil.getWriter(filesUploadPath + "/用户信息.xlsx");
        // 在内存操作，写出到浏览器
        ExcelWriter writer = ExcelUtil.getWriter(true);

        //自定义标题别名
//        writer.setHeaderAlias(headers);

        // 一次性写出list内的对象到excel，使用默认样式，强制输出标题
        writer.write(list, true);

        // 设置浏览器响应的格式
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        String fileName = URLEncoder.encode("学生信息", "UTF-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xlsx");

        ServletOutputStream out = response.getOutputStream();
        writer.flush(out, true);
        out.close();
        writer.close();
    }

    /**
     * 文件导入
     * @param file 文件
     * @param tClass 类class
     * @param <T> 类的类型
     */
    public static<T> List<T> FileIn(MultipartFile file, Class<T> tClass) throws IOException {
        InputStream inputStream = file.getInputStream();
        ExcelReader reader = ExcelUtil.getReader(inputStream);
        // 方式1：(推荐) 通过 javabean的方式读取Excel内的对象，但是要求表头必须是英文，跟javabean的属性要对应起来
        List<T> list = reader.readAll(tClass);

        return list;

//        // 方式2：忽略表头的中文，直接读取表的内容
//        List<List<Object>> list = reader.read(1);
//        for (List<Object> row : list) {
//            Student student = new Student();
//            student.setName(row.get(1).toString());
//            student.setSex(row.get(2).toString());
//            student.setBirthday(row.get(3).toString());
//            student.setMajor(row.get(4).toString());
//            student.setGrade(Double.parseDouble(row.get(5).toString()));
//            student.setSource_address(row.get(6).toString());
//            student.setScores(Double.parseDouble(row.get(7).toString()));
//            student.setPhone(row.get(8).toString());
//            student.setId(row.get(9).toString());
//            studentService.add(student);
//        }
    }
}
