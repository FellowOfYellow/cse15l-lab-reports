import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String strings = "";

    public String handleRequest(URI url) {
        ArrayList<String> returnedString = new ArrayList<String>();
        System.out.println("Path: " + url.getPath());
        if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                strings = strings + "\n" + parameters[1]);
                return strings;
            }
        }
        else if(url.getPath().contains("/add-message"")){
            String[] parameters = url.getQuery().split("=");
            for (String thing : strings){
                if(thing.contains(parameters[1])){
                    returnedString.add(thing);
                }
            }
            return String.format("Search results: %s", returnedString.toString());
        }
        return "404 Not Found!";
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }

}
