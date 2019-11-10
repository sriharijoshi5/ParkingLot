package parkinglotimp.consts;

import java.util.HashMap;
import java.util.Map;

public class MapCommands
{
	private static volatile Map<String, Integer> commandsParameterMap = new HashMap<String, Integer>();
	
	static
	{
		commandsParameterMap.put(Consts.CREATE_PARKING_LOT, 1);
		commandsParameterMap.put(Consts.PARK, 2);
		commandsParameterMap.put(Consts.LEAVE, 1);
		commandsParameterMap.put(Consts.STATUS, 0);
		commandsParameterMap.put(Consts.REG_NUMBER_FOR_CARS_WITH_COLOR, 1);
		commandsParameterMap.put(Consts.SLOTS_NUMBER_FOR_CARS_WITH_COLOR, 1);
		commandsParameterMap.put(Consts.SLOTS_NUMBER_FOR_REG_NUMBER, 1);
	}
	
	/**
	 * @return the commandsParameterMap
	 */
	public static Map<String, Integer> getCommandsParameterMap()
	{
		return commandsParameterMap;
	}
	
	/**
	 * @param commandsParameterMap
	 *            the commandsParameterMap to set
	 */
	public static void addCommand(String command, int parameterCount)
	{
		commandsParameterMap.put(command, parameterCount);
	}
	
}