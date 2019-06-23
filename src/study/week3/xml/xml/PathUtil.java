package study.week3.xml.xml;

public class PathUtil {

	public static String getClassPath(String filePath){
		return PathUtil.class.getResource("/").getPath()+filePath;
	}
}
