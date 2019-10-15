/*
 * MIT License
 *
 * Copyright (c) 2019 d3adspace
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.d3adspace.scorpia.server.tcp;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import de.d3adspace.scorpia.server.AbstractScorpiaServer;
import de.d3adspace.scorpia.server.ScorpiaServer;
import de.d3adspace.scorpia.server.config.ScorpiaServerConfig;

public final class ScorpiaTCPServer extends AbstractScorpiaServer {

    private ScorpiaTCPServer(String serverHost, int serverPort) {
        super(serverHost, serverPort);
    }

    public static ScorpiaServer create(String serverHost, int serverPort) {
        Preconditions.checkNotNull(serverHost);

        return new ScorpiaTCPServer(serverHost, serverPort);
    }

    @Override
    public ListenableFuture<Boolean> start() {
        return null;
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public ListenableFuture<Boolean> stop() {
        return null;
    }
}
