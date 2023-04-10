Main commands:
docker run -it fedora /bin/bash
or
docker run -itd fedora /bin/bash

[root@fedora ~]# docker run -itd fedora /bin/bash
Emulate Docker CLI using podman. Create /etc/containers/nodocker to quiet msg.
544c4a475fcd41c1000ae625cdc5cb9cdc5a8e8e0feb7ce343c5098689cccb52
[root@fedora ~]# 

[root@fedora ~]# docker ps
Emulate Docker CLI using podman. Create /etc/containers/nodocker to quiet msg.
CONTAINER ID  IMAGE                                     COMMAND     CREATED        STATUS        PORTS       NAMES
544c4a475fcd  registry.fedoraproject.org/fedora:latest  /bin/bash   2 minutes ago  Up 2 minutes              ecstatic_hoover
[root@fedora ~]# 

[root@fedora ~]# docker exec -it 544c4a475fcd /bin/bash
Emulate Docker CLI using podman. Create /etc/containers/nodocker to quiet msg.
[root@544c4a475fcd /]# 

docker stop 544c4a475fcd

docker run fedora /bin/bash -c "dnf -y upgrade; dnf -y install httpd"
[root@fedora ~]# docker ps -a | tail -1
Emulate Docker CLI using podman. Create /etc/containers/nodocker to quiet msg.
df99d6aa0eb7  registry.fedoraproject.org/fedora:latest  /bin/bash -c dnf ...  2 minutes ago   Exited (0) About a minute ago                      keen_bohr
[root@fedora ~]# docker images
Emulate Docker CLI using podman. Create /etc/containers/nodocker to quiet msg.
REPOSITORY                         TAG         IMAGE ID      CREATED         SIZE
localhost/fedora-httpd             latest      d586cc682985  16 seconds ago  513 MB
registry.fedoraproject.org/fedora  latest      38b8a6c320f3  4 weeks ago     190 MB
[root@fedora ~]# 
[root@fedora ~]# docker run localhost/fedora-httpd /usr/sbin/httpd -V
Emulate Docker CLI using podman. Create /etc/containers/nodocker to quiet msg.
Server version: Apache/2.4.56 (Fedora Linux)
Server built:   Mar  9 2023 00:00:00
Server's Module Magic Number: 20120211:126
Server loaded:  APR 1.7.2, APR-UTIL 1.6.3, PCRE 10.40 2022-04-14
Compiled using: APR 1.7.2, APR-UTIL 1.6.3, PCRE 10.40 2022-04-14
Architecture:   64-bit
Server MPM:     event
  threaded:     yes (fixed thread count)
    forked:     yes (variable process count)
Server compiled with....
 -D APR_HAS_SENDFILE
 -D APR_HAS_MMAP
 -D APR_HAVE_IPV6 (IPv4-mapped addresses enabled)
 -D APR_USE_PROC_PTHREAD_SERIALIZE
 -D APR_USE_PTHREAD_SERIALIZE
 -D SINGLE_LISTEN_UNSERIALIZED_ACCEPT
 -D APR_HAS_OTHER_CHILD
 -D AP_HAVE_RELIABLE_PIPED_LOGS
 -D DYNAMIC_MODULE_LIMIT=256
 -D HTTPD_ROOT="/etc/httpd"
 -D SUEXEC_BIN="/usr/sbin/suexec"
 -D DEFAULT_PIDLOG="run/httpd.pid"
 -D DEFAULT_SCOREBOARD="logs/apache_runtime_status"
 -D DEFAULT_ERRORLOG="logs/error_log"
 -D AP_TYPES_CONFIG_FILE="conf/mime.types"
 -D SERVER_CONFIG_FILE="conf/httpd.conf"
[root@fedora ~]# 

[root@fedora ~]# docker run -dt -p 8081:80 localhost/fedora-httpd /usr/sbin/httpd -D FOREGROUND
Emulate Docker CLI using podman. Create /etc/containers/nodocker to quiet msg.
adcd1d17ec5734845f824b6c51f43cace296b79819df3811707f1a2940b962ba
[root@fedora ~]# docker ps
Emulate Docker CLI using podman. Create /etc/containers/nodocker to quiet msg.
CONTAINER ID  IMAGE                                     COMMAND               CREATED         STATUS         PORTS                 NAMES
544c4a475fcd  registry.fedoraproject.org/fedora:latest  /bin/bash             20 minutes ago  Up 20 minutes                        ecstatic_hoover
adcd1d17ec57  localhost/fedora-httpd:latest             /usr/sbin/httpd -...  33 seconds ago  Up 34 seconds  0.0.0.0:8081->80/tcp  fervent_brattain

[root@fedora ~]# docker exec adcd1d17ec57 /bin/bash -c 'echo "httpd on Podman Container" > /var/www/html/index.html'
Emulate Docker CLI using podman. Create /etc/containers/nodocker to quiet msg.

[root@fedora ~]# docker inspect -l | grep \"IPAddress
Emulate Docker CLI using podman. Create /etc/containers/nodocker to quiet msg.
               "IPAddress": "10.88.0.13",
                         "IPAddress": "10.88.0.13",
[root@fedora ~]# curl 10.88.0.13
httpd on Podman Container
[root@fedora ~]# 


