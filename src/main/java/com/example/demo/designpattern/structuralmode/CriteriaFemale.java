package com.example.demo.designpattern.structuralmode;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dinghuang123@gmail.com
 * @since 2018/7/18
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> person.getGender()
                .equalsIgnoreCase("FEMALE")).collect(Collectors.toList());
    }
}
