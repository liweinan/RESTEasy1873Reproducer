package io.weli.resteasy1784;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class MyApplication extends Application {

// 去掉下面的也可以
//    HashSet<Object> singletons = new HashSet<Object>();
//
//    public MyApplication() {
//        singletons.add(new FooResource());
//
//    }

}
