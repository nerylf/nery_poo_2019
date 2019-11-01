package pacote;
import java.util.ArrayList;

public class Tweet{    
    String idUser;
    String msg;
    int likes;

    ArrayList<String> idLikadores; 

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Tweet(String idUser, String msg) {
        this.idUser = idUser;
        this.msg = msg;
        this.likes = 0;
        this.idLikadores = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return msg + " / likes = " + likes + " /] " + idLikadores;
    }

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
    
}