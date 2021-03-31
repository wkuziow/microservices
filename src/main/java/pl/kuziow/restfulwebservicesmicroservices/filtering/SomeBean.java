package pl.kuziow.restfulwebservicesmicroservices.filtering;

//to jest statycznie filtrowanie bo nie da się określić, że w jednym przypadku ukryj pole 1 a w innym pole 2

//to filtrowanie na górze jest gorsze bo np jak zmienimy nazwy pol to trzeba pamietać żeby tutaj teź zmienić
//@JsonIgnoreProperties(value = {"field1"})

import com.fasterxml.jackson.annotation.JsonFilter;

//filtrowanie dynamiczne
@JsonFilter("SomeBeanFilter")
public class SomeBean {

    private String field1;
    private String field2;

    //@JsonIgnore
    private String field3;

    public SomeBean(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }
}
