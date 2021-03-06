/*
 * Gnikrap is a simple scripting environment for the Lego Mindstrom EV3
 * Copyright (C) 2014-2015 Jean BENECH
 * 
 * Gnikrap is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Gnikrap is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Gnikrap.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gnikrap.script.ev3api;

import java.util.Map;

import org.gnikrap.script.EV3Exception;

/**
 * Exception returned while there in an exception in processing the script.
 */
public class EV3ScriptException extends EV3Exception {

  private static final long serialVersionUID = 2397603666216209480L;

  /**
   * "Sensor port '{port}' isn't valid should be in [S1, S2, S3, S4] or [1, 2, 3, 4]"
   */
  public static final String INVALID_SENSOR_PORT = "INVALID_SENSOR_PORT";

  /**
   * "Motor port '{port}' isn't valid, should be in [A, B, C, D]"
   */
  public static final String INVALID_MOTOR_PORT = "INVALID_MOTOR_PORT";

  /**
   * "{function} not implemented"
   */
  public static final String API_NOT_IMPLEMENTED = "API_NOT_IMPLEMENTED";

  /**
   * "Invalid channel value: '{channel}', valid values in [1, 2, 3, 4]"
   */
  public static final String INVALID_CHANNEL_VALUE = "INVALID_CHANNEL_VALUE";

  /**
   * "Invalid note: '{note}', should be in [C1-B7, # allowed on C, D, F, G, A] or [Do-Si, # allowed on Do, Re, Fa, Sol, La]"
   */
  public static final String INVALID_NOTE = "INVALID_NOTE";

  /**
   * "Script forced to stop, please use \"ev3.isRunning()\""
   */
  public static final String SCRIPT_STOP_FORCED = "SCRIPT_STOP_FORCED";

  /**
   * "Script already running while trying to launch another script"
   */
  public static final String SCRIPT_ALREADY_RUNNING = "SCRIPT_ALREADY_RUNNING";

  /**
   * "Can't read file '{filename}', technical error is: {error}"
   */
  public static final String CANT_READ_FILE = "CANT_READ_FILE";

  /**
   * "The image '{filename}' is corrupted (invalid file size)"
   */
  public static final String IMAGE_CORRUPTED = "IMAGE_CORRUPTED";

  /**
   * The data provided to build the image is not correct (check that all the lines should have the same length)
   */
  public static final String BAD_IMAGE_DATA = "BAD_IMAGE_DATA";

  /**
   * There is not enough data to decode an image with the following size: [{width}, {height}]
   */
  public static final String CANT_DECODE_IMAGE_INVALID_DATA_SIZE = "CANT_DECODE_IMAGE_INVALID_DATA_SIZE";

  /**
   * The data provided is not correct for an image, reason: '{reason}'
   */
  public static final String CANT_DECODE_IMAGE = "CANT_DECODE_IMAGE";

  /**
   * The type of the image provided is unknown: {type}
   */
  public static final String CANT_DECODE_IMAGE_INVALID_TYPE = "CANT_DECODE_IMAGE_INVALID_TYPE";

  /**
   * Unexpected error: '{error}'
   */
  public static final String UNEXPECTED_ERROR = "UNEXPECTED_ERROR";

  public EV3ScriptException(String code, Map<String, String> params) {
    super(code, params);
  }

  public EV3ScriptException(String code, Map<String, String> params, boolean notifyOnlyCaller) {
    super(code, params, notifyOnlyCaller);
  }
}
