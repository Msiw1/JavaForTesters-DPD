package a_introduction;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(getQuadrantIf(-1,8));
        System.out.println(getQuadrantSwitch(1,7));


    }

    public static String getQuadrantIf(int x, int y) {


        if ((x<0) && (y>0)) {
            return "ćwiartka 1";
        }
        else if ((x>0) && (y>0)){
            return "ćwiartka 2";
        }
        else if ((x>0) && (y<0)){
            return "ćwiartka 3";
        }
        else if ((x<0) && (y<0)){
            return "ćwiartka 4";
        }
        else return "Wynik znajduje się pomiędzy ćwiartkami";

    }

    public static String getQuadrantSwitch(int x, int y){

        int newX;
        int newY;

        if (x>0){
            newX=1;
        }
        else if (x==0) {
            newX=2;
        }
        else{
            newX=0;
        }

        if (y>0){
            newY=1;
        }
        else if (y==0){
            newY=2;
        }
        else{
            newY=0;
        }


        // 0 - (współrzędna<0)  1 - (współrzędna>0) 2 - (współrzędna=0)

        switch (newX) {
            case 0 -> {
                switch (newY) {
                    case 0 -> {
                        return "Jesteś w ćwiartce 4";
                    }
                    case 1 -> {
                        return "Jesteś w ćwiartce 1";
                    }
                    case 2 -> {
                        return "Jesteś między ćwiartkami";
                    }
                }
            }
            case 1 -> {
                switch (newY) {
                    case 0 -> {
                        return "Jesteś w ćwiartce 3";
                    }
                    case 1 -> {
                        return "Jesteś w ćwiartce 2";
                    }
                    case 2 -> {
                        return "Jesteś między ćwiartkami";
                    }
                }
            }
            case 2 -> {
                return "Jesteś między ćwiartkami";
            }
            default -> {
                return "nie umiem cię namierzyć";
            }
        }


        return null;
    }

}
