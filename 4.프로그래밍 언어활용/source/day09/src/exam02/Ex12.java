package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex12 {
    public static void main(String[] args) {
        String image1 = "<img class='image' src='https://naver.com/images/logo.png' alt='로고' id='logo'>";
        getImageSrc(image1);

    }

    public static String getImageSrc(String image){
        Pattern pattern = Pattern.compile("<img.*src=['\"]?([^'\"]+)['\"]?[^>]*>",Pattern.CASE_INSENSITIVE);
        Matcher m1 = pattern.matcher(image);
        if(m1.find()){
            System.out.println(m1.group(1));
        }
        return null;
    }
}
