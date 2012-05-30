package com.couchbase.touchdb.testapp.ektorp.tests;

import org.ektorp.support.OpenCouchDbDocument;

@SuppressWarnings("serial")
public class TestObject extends OpenCouchDbDocument {

    private Integer foo;
    private Boolean bar;
    private String baz;
    private String status;

    public Integer getFoo() {
        return foo;
    }

    public void setFoo(Integer foo) {
        this.foo = foo;
    }

    public Boolean getBar() {
        return bar;
    }

    public void setBar(Boolean bar) {
        this.bar = bar;
    }

    public String getBaz() {
        return baz;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TestObject() {

    }

    public TestObject(Integer foo, Boolean bar, String baz) {
        this.foo = foo;
        this.bar = bar;
        this.baz = baz;
        this.status = null;
    }

    public TestObject(Integer foo, Boolean bar, String baz, String status) {
        this.foo = foo;
        this.bar = bar;
        this.baz = baz;
        this.status = status;
    }

}
