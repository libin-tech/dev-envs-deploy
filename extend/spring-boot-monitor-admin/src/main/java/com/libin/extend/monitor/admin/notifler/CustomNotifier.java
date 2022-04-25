package com.libin.extend.monitor.admin.notifler;

import de.codecentric.boot.admin.server.domain.entities.Instance;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import de.codecentric.boot.admin.server.domain.events.InstanceEvent;
import de.codecentric.boot.admin.server.domain.events.InstanceStatusChangedEvent;
import de.codecentric.boot.admin.server.notify.AbstractEventNotifier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * 自定义事件通知处理
 *
 * @author im_libin@yeah.net
 * @date 2022/4/22 14:35
 */
@Slf4j
@Component
public class CustomNotifier extends AbstractEventNotifier {

  protected CustomNotifier(InstanceRepository repository) {
    super(repository);
  }

  @Override
  @SuppressWarnings("all")
  protected Mono<Void> doNotify(InstanceEvent event, Instance instance) {
    return Mono.fromRunnable(() -> {
      // 实例状态改变事件
      if (event instanceof InstanceStatusChangedEvent) {
        String registName = instance.getRegistration().getName();
        String instanceId = event.getInstance().getValue();
        String status = ((InstanceStatusChangedEvent) event).getStatusInfo().getStatus();
        log.info("Instance Status Change: [{}],[{}],[{}]", registName, instanceId, status);
      }
    });
  }
}
