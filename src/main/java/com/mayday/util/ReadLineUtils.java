package com.mayday.util;



import com.mayday.model.UserModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by EricAi on 2017/5/11.
 * 读取文本工具类
 */
public class ReadLineUtils {

    public static void main(String[] args) {

        File file = new File("D://Demo02.txt");
        BufferedReader reader = null;

        try {

            reader = new BufferedReader( new InputStreamReader( new FileInputStream(file), "UTF-8"));

            String tempString = null;

            int line = 1;

            //一次读入一行，直到读入null为文件结束

            List<UserModel> list=new ArrayList<UserModel>();

            while ((tempString = reader.readLine()) != null){
                System.out.println("第"+"line"+"行："+tempString);

                line++;

            }

            reader.close();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (reader != null){

                try {

                    reader.close();

                } catch (IOException e1) {

                }

            }

        }

    }

}






