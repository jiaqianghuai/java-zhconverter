package com.spreada.utils.chinese;
/** 
* @Author Jason 
* @Date 2015/12/18
*/ 

public class ZJFConverterDemo {  
  
    public static void main(String[] args) {  
        System.out.println("'简单'的繁体是：" + SimToTra("简单"));  
        System.out.println("'簡單'的简体是：" + TraToSim("簡單"));  
    }  
  
    /** 
     * 简体转繁体 
     *  
     * @param simpStr 简体字符串 
     * @return 繁体字符串 
     */  
    public static String SimToTra(String simpStr) {  
        ZHConverter converter = ZHConverter  
                .getInstance(ZHConverter.TRADITIONAL);  
        String traditionalStr = converter.convert(simpStr);  
        return traditionalStr;  
    }  
  
    /** 
     * 繁体转简体 
     *  
     * @param tradStr 繁体字符串 
     * @return 简体字符串 
     */  
    public static String TraToSim(String tradStr) {  
        ZHConverter converter = ZHConverter.getInstance(ZHConverter.SIMPLIFIED);  
        String simplifiedStr = converter.convert("tradStr");  
        return simplifiedStr;  
    }  
  
}  
