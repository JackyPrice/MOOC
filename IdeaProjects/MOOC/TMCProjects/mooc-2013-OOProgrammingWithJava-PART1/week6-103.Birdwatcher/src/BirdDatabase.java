import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birdList = new ArrayList<Bird>();
    private boolean search = false;

    public BirdDatabase() {
    }

    public void addBird(Bird bird) {
        System.out.println("addBird called for name: " + bird.getName() + ", latin name: " + bird.getLatinName());
        birdList.add(bird);
        bird.show();

        System.out.println("making the birdDatabase now contain:");
        for(Bird bird1 : birdList){
//            bird1.show();
            System.out.println(bird1.getName());
        }
        System.out.println("number of birds in database: " + birdList.size());
    }

    public void Statistics() {
        for (Bird bird : this.birdList) {
            bird.show();
        }
    }

    public void searchAndObserve(String name){
        System.out.println("search and observe called for " + name);
        name = name.toLowerCase();
        search=false;
        for(Bird bird: birdList){
            if(bird.getName().toLowerCase().equals(name) || bird.getLatinName().toLowerCase().equals(name)){
                bird.observation();
                bird.show();
                search=true;
            }

        }
        if(search == true){
            System.out.println("observation for added for: " + name);
        }
        if(search == false){
            System.out.println("Is not a bird!");
        }
    }

    public void showBird(String name){

        System.out.println("showBird called for: " + name);
        name.toLowerCase();
        search=false;
        for(Bird bird : birdList){
            if(bird.getName().toLowerCase().equals(name) || bird.getLatinName().toLowerCase().equals(name)){
                bird.show();
                search = true;
                break;
            }
        }
        if(search == false){
            System.out.println("Is not a bird!");
        }
    }
}
