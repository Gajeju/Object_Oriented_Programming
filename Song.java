package song;

public class Song {

	String title;
	public Song(String name) {
		title = name;
	}
	public String getTitle() {
		return title;
	}
	
	public static void main(String[] args) {
		
		Song mySong = new Song("Nessun Dorma");
		Song yourSong = new Song("���ִ� �� �� �̷��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� " + yourSong.getTitle());
	}

}
