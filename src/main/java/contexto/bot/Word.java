package contexto.bot;

public class Word {
    private int id;
    private String word;
    private int ranking;

    public void word(String w, int i){
        setWord(w);
        setId(i);
    }
    private void setWord(String w){
        word = w;
    }
    private void setId(int i){
        id = i;
    }
    public void setRanking(int r){
        ranking = r;
    }
    public int getId(){
        return id;
    }
    public String getWord(){
        return word;
    }
    public int getRaking(){
        return ranking;
    }
}   
