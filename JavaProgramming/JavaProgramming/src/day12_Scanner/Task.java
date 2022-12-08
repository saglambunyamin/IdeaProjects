package day12_Scanner;

public class Task {
    public static void main(String[] args) {
        String size = "grande";
        String result = "";

        if (size == "tall" || size == "grande" || size == "venti") {
            switch (size){
            case "tall":
                result = "price is $3.69\n90 calories";
                break;
                case "grande":
                result = "price is $3.99\n120 calories";
                break;
                default:
                result = "price is $4.29\n150 calories";
            }

        } else {
             result = "invalid";
        }
        System.out.println(result);

    }
}

/*		Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

 */