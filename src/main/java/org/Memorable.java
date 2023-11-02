package org;

import com.google.type.DateTime;

public interface Memorable {

    void saveSars (float s, float a, float r, boolean done, boolean dt, DateTime datetime);

    void get_minibatch();

    void erase();

    void time_init();

    void save_to_disk();

    void save_weight();

    void load_weight();

}
