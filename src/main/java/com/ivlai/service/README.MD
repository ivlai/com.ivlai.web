# com.ivlai.service
###存放服务层接口
服务层接口将统一化该服务需要实现的功能，一个接口可以有多个不同的实现方法来处理不同的业务。
该层可以用来解耦，当用户修改服务实现层（service.impl）时不会对其他调用该服务层的业务造成影响。
