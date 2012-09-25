package com.github.marschall.memoryfilesystem;

import java.nio.channels.ClosedChannelException;

final class ClosedChannelChecker extends ClosedChecker {

  void check() throws ClosedChannelException {
    if (!open) {
      throw new ClosedChannelException();
    }
  }

}
