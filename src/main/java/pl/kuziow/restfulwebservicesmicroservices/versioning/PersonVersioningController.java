package pl.kuziow.restfulwebservicesmicroservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
/*
    versionig using different uri
    */

    @GetMapping("v1/person")
    public PersonV1 personV1() {
        return new PersonV1("Adam Kowalski");
    }


    @GetMapping("21/person")
    public PersonV2 personV2() {
        return new PersonV2(new Name("Adam", "Kowalski"));
    }

    //versioning using param

    @GetMapping(value = "/person/param", params="version=1")
    public PersonV1 paramV1() {
        return new PersonV1("Adam Kowalski");
    }


    @GetMapping(value = "/person/param", params="version=2")
    public PersonV2 paramV2() {
        return new PersonV2(new Name("Adam", "Kowalski"));
    }

    //header versioning

    @GetMapping(value = "/person/header", headers="X-API-VERSION=1")
    public PersonV1 headersV1() {
        return new PersonV1("Adam Kowalski");
    }


    @GetMapping(value = "/person/header", headers="X-API-VERSION=2")
    public PersonV2 headersV2() {
        return new PersonV2(new Name("Adam", "Kowalski"));
    }

    //produces versioning
    //aka media type versionig
    //content negotiation

    @GetMapping(value = "/person/produces", produces="application/vmd.company.app-v1+json")
    public PersonV1 producesV1() {
        return new PersonV1("Adam Kowalski");
    }

    @GetMapping(value = "/person/produces", produces="application/vmd.company.app-v2+json")
    public PersonV2 producesV2() {
        return new PersonV2(new Name("Adam", "Kowalski"));
    }
}
