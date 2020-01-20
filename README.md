启动`jetty`服务器：

```bash
$ mvn jetty:run
```

如果需要调试，在执行上面的命令之前，添加下面的选项：

```bash
$ export MAVEN_OPTS='-Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005'
```

测试请求：

```bash
$ http localhost:8080/app/foo
HTTP/1.1 200 OK
Content-Length: 13
Content-Type: application/octet-stream
Date: Thu, 12 Sep 2019 03:07:40 GMT
Server: Jetty(9.4.17.v20190418)

Hello, world!

$
```

---

`RESTEASY-1873`的测试：


