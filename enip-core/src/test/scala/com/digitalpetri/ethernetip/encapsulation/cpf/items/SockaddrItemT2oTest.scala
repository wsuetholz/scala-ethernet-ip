/*
 * EtherNet/IP
 * Copyright (C) 2014 Kevin Herron
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.digitalpetri.ethernetip.encapsulation.cpf.items

import java.net.InetAddress

import org.scalatest.FunSuite

class SockaddrItemT2oTest extends FunSuite {

  val item = SockaddrItemT2o(Sockaddr(1, 44818, InetAddress.getLocalHost, 0))

  test("SockaddrItemT2o typeId == 0x8001") {
    assert(item.typeId == 0x8001)
  }

  test("SockaddrItemT2o is round-trip encodable/decodable") {
    val decoded = SockaddrItem.decode(SockaddrItem.encode(item))

    assert(item == decoded)
  }

}
