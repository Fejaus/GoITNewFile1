package com.goit.gojavaonline1;

import java.util.List;

public class FlowersBouquet {
    List<Astra> astra;
    List<Daisy> daisy;
    List<Rose> rose;
    List<RoseBush> roseBush;
    List<Tulip> tulip;

    public void setAstra(List<Astra> astra) {
        this.astra = astra;
    }

    public List<Astra> getAstra() {
        return astra;
    }

    public void setDaisy(List<Daisy> daisy) {
        this.daisy = daisy;
    }

    public List<Daisy> getDaisy() {
        return daisy;
    }

    public void setRose(List<Rose> rose) {
        this.rose = rose;
    }

    public List<Rose> getRose() {
        return rose;
    }

    public void setRoseBush(List<RoseBush> roseBush) {
        this.roseBush = roseBush;
    }

    public List<RoseBush> getRoseBush() {
        return roseBush;
    }

    public void setTulip(List<Tulip> tulip) {
        this.tulip = tulip;
    }

    public List<Tulip> getTulip() {
        return tulip;
    }
}
