package one;

import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.StringTokenizer;

public class ReadCSV {

public static void main(String[] args) { 
try { 
	File csv = new File("/media/cxyu/工作/BaiduYunDownload/百度百科语料/part-r-00000/part-r-00000.csv"); // CSV文件
//File csv = new File("/media/cxyu/DE46696646693FFF/迅雷下载/weibo数据/weibo_freshdata.2016-05-01/weibo_freshdata.csv"); // CSV文件
//change something2
BufferedReader br = new BufferedReader(new FileReader(csv));

// 读取直到最后一行 
String line = ""; 
while ((line = br.readLine()) != null) { 
// 把一行数据分割成多个字段 
StringTokenizer st = new StringTokenizer(line, ",");

while (st.hasMoreTokens()) { 
// 每一行的多个字段用TAB隔开表示 
System.out.print(st.nextToken() + "\t"); 
} 
System.out.println(); 
} 
br.close();

} catch (FileNotFoundException e) { 
// 捕获File对象生成时的异常 
e.printStackTrace(); 
} catch (IOException e) { 
// 捕获BufferedReader对象关闭时的异常 
e.printStackTrace(); 
} 
} 
}
