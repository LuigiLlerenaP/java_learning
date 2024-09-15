package ec.TypeStrings;

public class ExampleExtensionFile {
    public static void main(String[] args) {
        String filePicture = "something_picture.jpeg";
        System.out.println("filePicture.length() = " + filePicture.length());
        System.out.println("filePicture.indexOf('.') = " + filePicture.indexOf('.'));
        System.out.println("What is the extension ?  = " + filePicture.substring(filePicture.lastIndexOf('.')+1));
    }
}
