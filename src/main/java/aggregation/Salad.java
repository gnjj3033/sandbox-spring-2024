package aggregation;

public class Salad {

    private String lettuce;
    private String tomatoes;
    private String peppers;
    private String croutons;

    public Salad() {
        this.lettuce = "tons";
        this.tomatoes = "lots";
        this.peppers = "a few";
        this.croutons = "lots";
    }

    public Salad(String lettuce, String tomatoes, String peppers, String croutons) {

        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.peppers = peppers;
        this.croutons = croutons;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salad{");
        sb.append("lettuce='").append(lettuce).append('\'');
        sb.append(", tomatoes='").append(tomatoes).append('\'');
        sb.append(", peppers='").append(peppers).append('\'');
        sb.append(", croutons='").append(croutons).append('\'');
        sb.append('}');
        return sb.toString();
    }
    }

