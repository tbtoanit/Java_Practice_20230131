package buoi4;

public class BaiTap {
    public static void main(String[] args) {
        String[] members = {"Nguyen Van Hong", "Tran Quang Hai", "Tran Bao Toan"};
        System.out.println(qtyMemberNameByH(members));
    }
    /*
     * Bai 03: Cho danh sách họ tên đầy đủ học sinh, hãy đếm xem có bao nhiêu bạn có tên bắt đầu bằng chữ “H”.
     * String[] members = {"Nguyen Van Hong","Tran Quang Hai","Tran Bao Toan"}
     * */
    public static boolean checkNameByH(String s) {
        String[] stringArray = s.split(" "); //stringArray = {"Nguyen","Quang","Tai"}
        String ten = stringArray[stringArray.length - 1]; //ten = "Tai"
        String theFirstCharName = ten.substring(0, 1); //theFirstCharName = "T"

        if (theFirstCharName.equals("H") || theFirstCharName.equals("h")) {
            return true;
        } else { //=> vào trường hợp else bởi vì là chữ T
            return false;
        }

    }
    public static int qtyMemberNameByH(String[] members) {
        int count = 0;
        for (int i = 0; i < members.length; i++) {
            if (checkNameByH(members[i])) {
                count++;
            }
        }
        return count;
    }

    /*
     * Bài 01: cho trước 1 chuỗi ký tự bất kỳ, hãy đếm xem trong chuỗi có bao nhiêu lần xuất hiện chuỗi con là  "abc".
     * */
    public static void countSubString() {
        String masterString = "abcmy name abc is toan abca";
        int count = 0;
        char[] ch = masterString.toCharArray();
        for (int i = 0; i < ch.length - 2; i++) {
            if (ch[i] == 'a' && ch[i + 1] == 'b' && ch[i + 2] == 'c') {
                count++;
            }
        }

        System.out.println(count);

    }

    /*
     * Bài 02: Cho trước 1 chuỗi ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này
     * (họ là từ nằm đầu tiên của chuỗi bao gồm họ và tên)
     * */
    public static void getLastName() {
        String yourName = "Nguyen Thi Luu";
        String lastName = "";
        char[] ch = yourName.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                break;
            } else {
                lastName += ch[i];
            }
        }

        System.out.println(lastName);

    }

    public static void getLastName2() {
        String yourName = "Tran-Bao-Toan";
        String[] stringArray = yourName.split("-"); // stringArray = {"Tran","Bao","Toan"}
        System.out.println(stringArray[0]);
    }


}
