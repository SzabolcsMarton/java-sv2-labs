package stringmethods.filename;

import java.util.Locale;

public class FileNameManipulator {

    public char findLastCharacter(String str){
        return str.trim().charAt(str.length() - 1);
    }

    public String findFileExtension(String filename){
        int index = filename.indexOf(".") + 1;
        return filename.substring(index);
    }

    public boolean identifyFilesByExtensions(String ext, String fileName){
        String extensionOfFile = findFileExtension(fileName.trim());
        return ext.trim().equalsIgnoreCase(extensionOfFile);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        return searchedFileName.trim().equalsIgnoreCase(actualFileName.trim());
    }

    public  String changeExtensionToLowerCase(String fileName){
        String ext = findFileExtension(fileName);
        return fileName.replace(ext,ext.toLowerCase());
    }

    public String replaceStringPart(String filename, String actual, String target){
        return filename.replace(actual,target);
    }


    public static void main(String[] args) {

        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter("auto"));
        System.out.println(fileNameManipulator.findFileExtension("autoexec.com"));
        System.out.println();
        System.out.println(fileNameManipulator.identifyFilesByExtensions("com", "autoexec.bat"));
        System.out.println(fileNameManipulator.identifyFilesByExtensions("com", "autoexec.com"));
        System.out.println();
        System.out.println(fileNameManipulator.compareFilesByName("autoexec.com", " autoexec.com"));
        System.out.println(fileNameManipulator.compareFilesByName("autoexec.com", "auoexec.com"));
        System.out.println();
        System.out.println(fileNameManipulator.changeExtensionToLowerCase("test.com"));
        System.out.println(fileNameManipulator.changeExtensionToLowerCase("test.COM"));
        System.out.println();
        System.out.println(fileNameManipulator.replaceStringPart("test-test.com", "-", "_"));

    }
}
