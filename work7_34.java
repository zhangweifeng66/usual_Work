import java.util.Arrays;
import java.util.Scanner;

public class work7_34 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("�������ַ���������ĸ��ɣ���");
	    String str = scanner.next();
	    System.out.print("�������ַ���Ϊ��" + sort(str));
	}
	 
	private static String sort(String str) {
	    char[] chArray = new char[str.length()];
	    String newStr = "";
	    for (int i = 0; i < chArray.length; i++) {
	        if (i != chArray.length - 1) {
	            chArray[i] = str.substring(i, i + 1).charAt(0);//��ȡָ�������ַ���
	        } else {
	            chArray[i] = str.substring(i).charAt(0);
	        }
	    }
	    Arrays.sort(chArray);
	    for (char ch : chArray) {
	        newStr += String.valueOf(ch);  //����ǰ�������
	    }
	    return newStr;
	}
}
