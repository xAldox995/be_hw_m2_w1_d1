package aldovalzani.be_hw_m2_w1_d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Pizza extends Alimento {
    private List<Topping> condimenti = new ArrayList<>();
}
