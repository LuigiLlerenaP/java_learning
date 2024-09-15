package ec.TypeStrings;

public class ExampleMethodArrays {
    public static void main(String[] args) {
        String tongueTwisters ="TongueTwisters";
        System.out.println("tongueTwisters.toCharArray() = " + tongueTwisters.toCharArray());
        char[] arrayT = tongueTwisters.toCharArray();
        for (int i =0 ; i<arrayT.length ; i++){
            System.out.println("arrayT[i] = " + arrayT[i]);
        }
        System.out.println("tongueTwisters = " + tongueTwisters.split("e"));
        String [] arrayStringT = tongueTwisters.split("e");
        for (int i = 0 ; i<arrayStringT.length;i++){
          System.out.println("arrayStringT[i] = " + arrayStringT[i]);
        }
        String filePicture = "something_picture.jpeg";
        int inP = filePicture.lastIndexOf('.');
        String extension = filePicture.substring(inP+1 );
        System.out.println("extension = " + extension);
        String [] arrayFile = filePicture.split("\\.");
        for (int i =0 ; i<arrayFile.length ;i++){
            System.out.println("arrayFile[i] = " + arrayFile[i]);
        }
        System.out.println("extension = " + arrayFile[arrayFile.length-1]);

    }
}
