package day3;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String stadt = sc.nextLine();
            if (stadt.equals("Stop")) {
                break;
            }
            switch (stadt) {

                case "Stop":
                    break;

                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println(" - это Россия!");
                    break;

                case "Мюнхен":
                case "Берлин":
                case "Кёльн":
                    System.out.println(" - это Германия!");
                    break;

                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println(" - это Италия!");
                    break;

                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println(" - это Англия!");
                    break;

                default:
                    System.out.println(" - это неизвестная страна");
            }
        }

    }
}
