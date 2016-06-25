package String;

/**
 * Created by liuyang on 16/6/25.
 * 空格替换
 */
public class Replacement {
    public String replaceSpace(String iniString, int length) {
        char[] iniArr = iniString.toCharArray();
        char[] arr = new char[3000];
        int arrLength = 0;
        for(int i=0,j=0;i<length;i++,j++){
            if(iniArr[i]==' '){
                arr[j]='%';
                arr[++j]='2';
                arr[++j]='0';
            }
            else{
                arr[j]=iniArr[i];
            }
            arrLength = j;
        }
        iniString = String.valueOf(arr);
        iniString = iniString.substring(0,arrLength+1);
        return iniString;
    }
}
