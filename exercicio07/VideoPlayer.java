package exercicio07;

public class VideoPlayer {
    IVideo video;

    public VideoPlayer(IVideo video) {
        this.video = video;
    }

    public void play(){
        for (String l: video.getContent()){
            System.out.print(l);
        }
        System.out.println();
    }  
}
