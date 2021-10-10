//문제 서울에서 김서방 찾기
//
public class FindSeoul {
    public String findseoul(String[] seoul){
        int x = 0;
        while(x<seoul.length){
            if(seoul[x] == "Kim")
                break;
            else x++;
        }
        return "김서방은" + x + "에 있다";
    }
    public static void main(String[] args) {
        FindSeoul kim = new FindSeoul();
        String[] names = {"nalee","hbang","sehong","Kim"};
        System.out.println(kim.findseoul(names));
    }
}
