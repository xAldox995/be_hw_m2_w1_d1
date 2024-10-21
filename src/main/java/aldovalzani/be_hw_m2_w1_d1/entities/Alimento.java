package aldovalzani.be_hw_m2_w1_d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class Alimento {
    protected String name;
    protected double price;
    protected int calories;
}
