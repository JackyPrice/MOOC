public class Reformatory {

    private int numberOfTimesMeasured;

    public int weight(Person person) {

        numberOfTimesMeasured++;
        // return the weight of the person
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return numberOfTimesMeasured;
    }

}
