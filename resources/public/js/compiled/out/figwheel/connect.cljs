(ns figwheel.connect (:require [undo-redo.core] [figwheel.client] [figwheel.client.utils]))
(figwheel.client/start {:on-jsload (fn [& x] (if js/undo-redo.core.on-js-reload (apply js/undo-redo.core.on-js-reload x) (figwheel.client.utils/log :debug "Figwheel: :on-jsload hook 'undo-redo.core/on-js-reload' is missing"))), :build-id "dev", :websocket-url "ws://localhost:3449/figwheel-ws"})
