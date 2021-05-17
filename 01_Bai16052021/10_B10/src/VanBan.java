public class VanBan {
    private String string;

    public VanBan() {
    }

    public VanBan(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int countWord(String string) {
        int count = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }

    public int countLetterA(String string){
        int count = 0;
        for (int i = 0; i<string.length(); i++){
            if (string.charAt(i) == 'a' || string.charAt(i) == 'A'){
                count++;
            }
        }
        return count;
    }
    public void standardize(String string){
        string = string.replaceAll("\\s\\s+", " ");
        string = string.trim();
        System.out.println(string);
    }
}
