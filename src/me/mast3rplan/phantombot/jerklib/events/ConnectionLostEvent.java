/* 
 * Copyright (C) 2015 www.phantombot.net
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package me.mast3rplan.phantombot.jerklib.events;

import me.mast3rplan.phantombot.jerklib.Session;

/**
 * The event fired when a connection to a server is lost (disconnected).
 *
 * @author mohadib
 */
public class ConnectionLostEvent extends IRCEvent
{

    private Exception e;

    public ConnectionLostEvent(String data, Session session, Exception e)
    {
        super(data, session, Type.CONNECTION_LOST);
        this.e = e;
    }

    public Exception getException()
    {
        return e;
    }
}
