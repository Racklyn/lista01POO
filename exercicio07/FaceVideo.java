package exercicio07;

public class FaceVideo extends Video {
    private final boolean[] bitsFace;

    public FaceVideo() {
        bitsFace = new boolean[] {
                false, true, false, true, false, false, false, false, false, true,
                true, false, false, false, false,
                true, false, true, true, true, false, false, true, false, false,
                true, true, false, false, false, false,
                true, false, true, true, false, false, false, true, false, true,
                true, true, false, true, false, false,
                true, false, true, true, false, true, true, true, false, false,
                true, true, true, false, false, true,
                true, false, false, true, false, true, true, false, false, false,
                false, true, false, false, false,
                false, false, false, true, true, true, false, true, true, false,
                false, true, true, false, false, false,
                true, true, false, false, true, false, false, false, false, false,
                false, true, true, false, false,
                false, true, true, false, true, true, false, true, true, true, true,
                false, true, true, false, true,
                true, true, false, false, true, true, true, false, false, true,
                true, false, true, true, false, false,
                true, false, true, false, true, true, false, false, true, true,
                true, false, true, true, true, false,
                true, false, true, false, true, true, false, true, false, false,
                true, false, true, true, true, false,
                true, false, true, false, false, true, false, true, true, true,
                false
        };
    }

    public boolean[] getBitsFace() {
        return bitsFace;
    }

    @Override
    public String[] getContent() {
        int nBits = bitsFace.length / 8;
        String[] content = new String[nBits];
    
        for (int c=0; c<nBits; c++){
            String binString = "";
            for (int i=c*8; i<(c+1)*8; i++){
                binString += bitsFace[i] ? "1" : "0";
            }
            content[c] = (Character.toString ((char) Integer.parseInt(binString, 2)));
        }

        return content;
    }
}