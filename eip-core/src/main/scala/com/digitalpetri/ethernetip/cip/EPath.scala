package com.digitalpetri.ethernetip.cip

import io.netty.buffer.ByteBuf

trait EPath // TODO

object EPath {
  def encode(path: EPath, buffer: ByteBuf) {
    // TODO
  }

  def decode(buffer: ByteBuf): EPath = {
    ??? // TODO
  }
}