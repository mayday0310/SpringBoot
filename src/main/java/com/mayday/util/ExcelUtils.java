package com.mayday.util;

import com.mayday.model.MeetModel;
import com.mayday.model.UserModel;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.write.*;
import jxl.write.biff.LabelRecord;
import org.apache.coyote.Response;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by EricAi on 2017/5/12.
 * 导出Excel工具类
 */
public class ExcelUtils {

    public static boolean exportGiftUserExcel(HttpServletResponse response,List<MeetModel> list) {

        MeetModel meetModel=new MeetModel();
        meetModel.setId(1);
        meetModel.setName("郭声琨");
        meetModel.setLevel("公安部部长");

        try {

            //获取当前日期
            String date=DateUtils.getNow(DateUtils.FORMAT_SHORT);
            //导出的excel文件的名称
            String excelName="以爱之名";

            OutputStream os = response.getOutputStream();// 取得输出流
            response.reset();// 清空输出流
            response.setHeader("Content-disposition","attachment; filename="+excelName+".xls");// 设定输出文件头
            response.setContentType("application/msexcel");// 定义输出类型

            WritableWorkbook wbook = Workbook.createWorkbook(os); // 建立excel文件

            String tmptitle ="中共十九大参会名单"; // 标题
            WritableSheet wsheet = wbook.createSheet(tmptitle, 0); // sheet名称

            // 设置excel标题（这里主要设计样式）
            WritableFont wfont = new WritableFont(WritableFont.ARIAL, 16,
                    WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,
                    Colour.BLACK);
            WritableCellFormat wcfFC = new WritableCellFormat(wfont);

            wsheet.addCell(new Label(1, 0, tmptitle, wcfFC));
            wfont = new jxl.write.WritableFont(WritableFont.ARIAL, 14,
                    WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,
                    Colour.BLACK);
            wcfFC = new WritableCellFormat(wfont);

            // 开始生成主体内容

            wsheet.addCell(new Label(0, 2, "编号"));
            wsheet.addCell(new Label(1, 2, "姓名"));
            wsheet.addCell(new Label(2, 2, "职位"));


            for (int i = 0; i < list.size(); i++) {
                //生成的内容

                wsheet.addCell(new Label(0, i + 3, String.valueOf(list.get(i).getId())));
                wsheet.addCell(new Label(1, i + 3, list.get(i).getName()));
                wsheet.addCell(new Label(2, i + 3, list.get(i).getLevel()));


            }

            wbook.write(); // 写入文件
            wbook.close();
            os.close(); // 关闭流
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
