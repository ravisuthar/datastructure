package hackerrank.parking.com.gb.parkinglot.model.account;

import hackerrank.parking.com.gb.parkinglot.model.account.common.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
    private String phone;
    private String email;
    private Address address;
    private PersonalInfo personalInfo;
}
