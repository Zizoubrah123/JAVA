package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public interface HIPAACompliantUser {
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);



}
