package morning;

import java.util.ArrayList;

//Q4 : Word boxing
//
//
//        “String is very important class in Java for solving problems”
//
//        Now for the given sentence
//        • create an array which holds String”
//        • separate the above sentence into words and add into array
//        • create a function to display words with odd size
//        • create a function to display words with even size
//        • create a function to display words which starts with consonants
public class WordBoxing {

    public void wordBoxing(){
        String sentence = "String is very important class in Java for solving problems";
        String [] wordArray=sentence.split(" ");
        ArrayList<String> oddWord = new ArrayList<>();
        ArrayList<String> evenWord = new ArrayList<>();
        ArrayList<String> consonantStartWord = new ArrayList<>();

        for (int i = 0; i < wordArray.length; i++) {
            if(wordArray[i].length()%2==1){
                oddWord.add(wordArray[i]);
            }
            if(wordArray[i].length()%2==0){
                evenWord.add(wordArray[i]);
            }
            if(!wordArray[i].startsWith("a")
                    ||!wordArray[i].startsWith("e")
                    ||!wordArray[i].startsWith("i")
                    ||!wordArray[i].startsWith("o")
                    ||!wordArray[i].startsWith("u")){

                consonantStartWord.add(wordArray[i]);
            }
            
        }
        System.out.println("-----------Odd words-----");
        for (String s :
                oddWord) {
            System.out.println(s);
        }

        System.out.println("-----------Even Words------");
        for (String s :
                evenWord) {
            System.out.println(s);

        }

        System.out.println("--------Consonant starting word");
        for (String s :
                consonantStartWord) {
            System.out.println(s);
        }
    }


    public void pattern(){
        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i = 4; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public void convertToBinary(int num) {
        String binaryStr="";
        int remainder;
        int result=num;
        while (result!=0){
            remainder=result%2;
            binaryStr=remainder+binaryStr;
            result=result/2;

            System.out.println(num);
        }

    }
}
