package exercicio07;

public class Program {
    public static void main(String[] args) {
        FaceVideo faceVideo = new FaceVideo();
        YoutubeVideo youVideo = new YoutubeVideo();

        VideoPlayer player = new VideoPlayer(faceVideo);
        player.play();

        VideoPlayer player2 = new VideoPlayer(youVideo);
        player2.play();
    }
}
