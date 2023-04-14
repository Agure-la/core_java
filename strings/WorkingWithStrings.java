public class WorkingWithStrings {

    //different ways of creating strins
    String name = "Joan Awuor";
    String name1 = new String("Joan Achieng");

    //concatenate strings
    public void concatenateStrings(){
        System.out.println("My name is :" + "" + name);
        System.out.println("My name is :" + "" + name1);
    }

    //find length of string using .length
    public void findLength(){
        char[] len = name.toCharArray();
        System.out.println(len.length);
    }

    //extract a string using substring
    public void extractString(){
        String sentence = "My name is Joan";
        String subs = sentence.substring(4,9);
        System.out.println(subs);
    }

    //search String using indexOf
    public void search(){
        String sentence = "Till me meet again";
        System.out.println(sentence.indexOf("meet"));
    }

    //Matching a String Against a Regular Expression With matches()
    public void merge(){
        String sentence = "Welcome to java all";
        System.out.println(sentence.matches("(.*)java(.*)"));
        System.out.println(sentence.matches("java"));
        System.out.println(sentence.matches("Welcome(.*)"));
    }

    //Comparing strings using the methods equals()
    public void testEqual(){
        String str1 = "my name is";
        String str2 = "my name is";
        String str3 = "name is";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }

    //equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
    public void testAllThree(){
        String str1 = "my name is";
        String str2 = "MY NAME IS";
        String str3 = "name is roNALD";
        System.out.println(str1.equalsIgnoreCase(str2));
        String sentence = "My name is Joan";
        System.out.println(sentence.startsWith("My"));
        System.out.println(sentence.startsWith("is"));
        System.out.println(sentence.endsWith("Joan"));
        System.out.println(sentence.endsWith("My"));
    }

    //Trimming strings with trim()
    public void trimString(){
        String str1 = " We are all coming to the office today ";
        String str2 = " not in the office today .";
        System.out.println(str1.trim());
        System.out.println(str2.trim());
    }

    //Replacing characters in strings with replace()
    public void replaceString(){
        String sentence = "JavaScript is avery good language, please learn JavaScript";
        System.out.println(sentence.replace("JavaScript","Java"));
    }

    //Splitting strings with split()
    public void splitStrings(){
        String sentence = "JavaScript is avery good language, please learn JavaScript";
        String[] splits = sentence.split("\\s");

        for(String split2 : splits){
            System.out.println(split2);
        }
    }

    //Converting Numbers to Strings with valueOf()
    public void convertToString(){
        int number = 120;
        String converted = String.valueOf(number);
        System.out.println(converted);
    }

    //Converting integer objects to Strings
//    public void convertObjectsToString(){
//        Integer obj = new Integer(10);
//        String stringWasInt = String.valueOf(obj);
//        System.out.println(stringWasInt );
//    }

    //Converting to uppercase and lowercase
    public void convertToLowercaseAndUppercase(){
        String str1 = "JOAN";
        String str2 = "joe";
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
    }
}

